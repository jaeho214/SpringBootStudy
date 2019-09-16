package com.example.springbootstudy.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello() throws ExceptionHandlerCustom {
        throw new ExceptionHandlerCustom();
    }

    @ExceptionHandler(ExceptionHandlerCustom.class)
    public @ResponseBody AppError sampleError(ExceptionHandlerCustom e){
        AppError appError = new AppError();
        appError.setMessage("message");
        appError.setReason("IDK IDK");
        return appError;
    }
}
