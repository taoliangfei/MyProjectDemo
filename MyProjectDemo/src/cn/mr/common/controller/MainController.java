package cn.mr.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
@RequestMapping(value = "/**/mainMgmt")
public class MainController extends MultiActionController {

}
