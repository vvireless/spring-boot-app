package com.example.sbblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SQLService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Method to get all blog posts
    public List<Map<String, Object>> getAllBlogPosts() {
        String sql = "SELECT * " +
                "FROM registration_post " +
                "WHERE description LIKE '%summer%' " +
                "OR title LIKE '%summer%';";
        return jdbcTemplate.queryForList(sql);
    }

    // Include the rest of your methods here - one for each SQL query you want to run against your database
}
