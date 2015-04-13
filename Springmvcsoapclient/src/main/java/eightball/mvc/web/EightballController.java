package eightball.mvc.web;

import eightball.mvc.model.EightballDTO;
import eightball.mvc.service.EightballClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ComponentScan({"eightball.mvc.service", "eightball.mvc.model"})
public class EightballController {

	@Autowired 
	private EightballDTO ballDTO;
	
	
			
    @RequestMapping(value="/eightball", method=RequestMethod.GET)
    public String questionForm(Model model) {
    	model.addAttribute("ballDTO",ballDTO);	
        return "question";
    }
    @Autowired
	private EightballClient eightballclient;
    
    @RequestMapping(value="/eightball", method=RequestMethod.POST) 
    public String answerSubmit(@ModelAttribute EightballDTO ballDTO, Model model) { 
    	eightballclient.getAnswer(ballDTO);
        model.addAttribute("ballDTO", ballDTO);
        return "answer";
    }

}
