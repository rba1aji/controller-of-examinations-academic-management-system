package server.rba1aji.academicmanagementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.rba1aji.academicmanagementsystem.models.Mark;
import server.rba1aji.academicmanagementsystem.services.IMarkService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/marks")
public class MarkController {
    @Autowired
    IMarkService markService;

    @PutMapping("/updateForList")
    public ResponseEntity<Map<String, String>> updateMarksList(@RequestBody List<Mark> markList) {
        markService.updateForList(markList);
        var res = new HashMap<String, String>();
        res.put("message", "Updated marks");
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/getByBatchidExamidCourseid")
    public ResponseEntity<Map<String, List<Mark>>> getMarksForBatchStudents(@RequestParam Integer batchid, @RequestParam Integer examid, @RequestParam String courseid) {
        var res = new HashMap<String, List<Mark>>();
        res.put("marks", markService.getByBatchidExamidCourseid(batchid, examid, courseid));
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
