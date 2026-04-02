# fitness-tracker-core

A robust Core Java backend ecosystem for advanced biometric tracking and health analytics. Engineered with "aseptic" clean architecture and strict SOLID principles to support future AI-driven predictive modeling. No frameworks — pure engineering logic and high-performance OOP.

## 🎯 Project Overview
Developing a highly structured backend system designed for deep analysis of physical activity, nutrition, and physiological metrics. The project focuses on data integrity and architectural scalability, moving beyond simple logging toward predictive health insights.

## 🏗 Key Architectural Concepts

### 1. "Aseptic" & Data-Driven Design
Every class is "sterile" (SRP-compliant), ensuring that complex health calculations (Metabolic rates, Heart Rate zones) are decoupled from data management.
* **Separation of Concerns:** Business logic, biometric processing, and repository layers are strictly isolated.

### 2. Biometric & Nutrition Ecosystem
The system is being expanded to handle multi-dimensional data inspired by professional athletic tracking:
* **Advanced Nutrition Tracking:** Logic for macronutrient (PFC) calculation, calorie density, and future barcode (EAN/UPC) API integration.
* **Biometric Analysis:** Integration of Heart Rate (HR) variability, Body Fat percentage (Pinch Test), and Intensity scales to assess physical state.

### 3. Deep Hierarchy of Activity Models
Extensible inheritance tree to manage diverse physical loads:
* **AbstractSet:** Base logic for recovery and rest intervals.
* **RepsWeightSet:** Specific logic for progressive overload in strength training.
* **CardioMetrics:** Logic for endurance activities, incorporating time, distance, and HR intensity.

### 4. Smart Localization (LanguageManager)
A custom-built i18n engine using a centralized HashMap-based dictionary for seamless English/Russian localization.

## 🛠 Tech Stack
* **Language:** Java 17+
* **Data Architecture:** Advanced Java Collections (List, Map, Set) used for complex data correlation.
* **Analysis Tools:** Custom mathematical models for metabolic and weight loss forecasting.
* **Environment:** IntelliJ IDEA | Git.

## 🚀 Future Roadmap & AI Integration
* **AI Predictive Modeling:** Implementing machine learning algorithms to predict weight/strenght/speed/endurance/power loss/gain trends and fatigue levels based on accumulated biometric data.
* **Database Migration:** Transitioning from in-memory storage to PostgreSQL for persistent, large-scale data management.
* **Barcode Scanner Integration:** Connecting to external Food Databases via REST APIs.
* **Smart Advisor:** An AI-driven recommendation engine to provide users with personalized feedback on their progress.
