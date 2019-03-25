package com.farhan.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*@RequestMapping("/")
	public String showMyPage() {
		return "karyawan-form";
	}*/
	
	/*@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String nama = request.getParameter("nama");
		String alamat = request.getParameter("alamat");
		String gender = request.getParameter("gender");
		String tahunmasuk = request.getParameter("tahunmasuk");
		String gaji = request.getParameter("gaji");
		
		model.addAttribute("id", id);
		model.addAttribute("nama", nama);
		model.addAttribute("alamat", alamat);
		model.addAttribute("gender", gender);
		model.addAttribute("tahunmasuk", tahunmasuk);
		model.addAttribute("gaji", gaji);
		return "karyawan-display";
	}*/
		
		@RequestMapping(value = "/entry", method = RequestMethod.GET)
	    public ModelAndView showForm() {
	        return new ModelAndView("karyawan-form", "karyawan", new Karyawan());
	    }
		
	    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
	    public String submit(@ModelAttribute("karyawan")Karyawan karyawan, 
	      BindingResult result, ModelMap model) {
	        if (result.hasErrors()) {
	            return "error";
	        }
	        model.addAttribute("id", karyawan.getId());
	        model.addAttribute("nama", karyawan.getNama());
	        model.addAttribute("alamat", karyawan.getAlamat());
	        model.addAttribute("gender", karyawan.getGender());
	        model.addAttribute("tahunmasuk", karyawan.getTahunmasuk());
	        model.addAttribute("gaji", karyawan.getGaji());
	        return "karyawan-display";
	    }
}
