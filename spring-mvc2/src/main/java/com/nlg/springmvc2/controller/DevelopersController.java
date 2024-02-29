package com.nlg.springmvc2.controller;

import com.nlg.springmvc2.model.Developer;
import com.nlg.springmvc2.model.Skill;
import com.nlg.springmvc2.repository.DeveloperRepository;
import com.nlg.springmvc2.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class DevelopersController {
    @Autowired
    DeveloperRepository repository;

    @Autowired
    SkillRepository skillRepository;

    @RequestMapping("developer/{id}")
    public String developer(@PathVariable Long id, Model model){
        model.addAttribute("developer", repository.findById(id));
        model.addAttribute("skills", skillRepository.findAll());
        return "developer";
    }

    @RequestMapping(value = "/developers", method = RequestMethod.GET)
    public String developersList(Model model){
        model.addAttribute("developers", repository.findAll());
        return "developers";
    }

    @RequestMapping(value = "/developers", method = RequestMethod.POST)
    public String developersAdd(@RequestParam String email, @RequestParam String firstName, @RequestParam String lastName, Model model){
        Developer newDeveloper = new Developer();
        newDeveloper.setEmail(email);
        newDeveloper.setFirstName(firstName);
        newDeveloper.setLastName(lastName);
        repository.save(newDeveloper);

        model.addAttribute("developer", newDeveloper);
        model.addAttribute("skills", skillRepository.findAll());
        return "redirect:/developer/"+newDeveloper.getId();
    }

    @RequestMapping(value = "/developer/{id}/skills", method = RequestMethod.POST)
    public String developersAddSkill(@PathVariable Long id, @RequestParam Long skillId, Model model){
        Optional<Skill> skill = skillRepository.findById(skillId);
        Optional<Developer> developer = repository.findById(id);

        if(!developer.isEmpty()){
            if(!developer.get().hasSkill(skill)){
                developer.get().getSkills().add(skill.get());
            }

            repository.save(developer.get());
            model.addAttribute("developer", repository.findById(id));
            model.addAttribute("skills", skillRepository.findAll());
            return "redirect:/developer/" + developer.get().getId();
        }

        // otherwise
        model.addAttribute("developers", repository.findAll());
        return "redirect:/developers";
    }
}
