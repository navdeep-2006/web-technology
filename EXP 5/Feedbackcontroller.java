package com.example.feedback.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class FeedbackController {
@GetMapping("/feedback")
public String showForm() {
return "feedback";
}
@PostMapping("/feedback")
public String handleForm(@RequestParam String username,
@RequestParam String message,
Model model) {
model.addAttribute("username", username);
model.addAttribute("message", message);
return "result";
}
}
