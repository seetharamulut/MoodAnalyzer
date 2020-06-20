package com;

public class MoodAnalyzer {
    public String analyzeMood(String message) {
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }

        }
    }

