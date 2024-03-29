package com.earlyadopter.backend.controller.api;

import com.earlyadopter.backend.dto.document.product.BRAND_INDEX;
import com.earlyadopter.backend.service.api.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crawling")
public class CrawlingController {

    private final CrawlingService crawlingService;

    @Autowired
    public CrawlingController(CrawlingService crawlingService) {
        this.crawlingService = crawlingService;
    }

    @PostMapping("/musinsaBrand")
    public ResponseEntity<BRAND_INDEX> musinsaBrandCrawling() {

        crawlingService.addNewCategories();
        return ResponseEntity.ok().build();
    }
}
