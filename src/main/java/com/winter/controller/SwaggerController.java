package com.winter.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.winter.model.Book;

@Slf4j
@RestController
public class SwaggerController {
	
    @RequestMapping(value="/book", method=RequestMethod.POST)
    @ApiOperation(value = "书籍post请求", notes = "书籍post请求api")
    @ApiImplicitParam(name = "id", value = "关联id", required = true, dataType = "Long", paramType = "query")
    //paramType  类型  有  path  query body header form  
    public String post(@RequestBody Book book) {
        //books.put(book.getId(), book);
    	System.out.println(book.getId());
    	log.info("lombok大法真的是极好的...");
        return "success";
    }


}
