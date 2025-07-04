package com.lifetracker.controller;

import com.lifetracker.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoalController {

    @Autowired
    GoalService goalService;


}
