University-App

Welcome to **UniversityApp**, an Android application designed to streamline university-related tasks and enhance the student experience. This project, developed using Android Studio, serves as a practical tool for managing schedules, assignments, and resources for university students.

 Repository Link
- Git Repository: [https://github.com/shre-1/University-App](https://github.com/shre-1/University-App.git)
  
  Project was initially created as "PetCareAssessment2" with a focus on pet management but has been repurposed into "University App" to address university-specific needs. The tasks undertaken include:
- **App Renaming:** Modified the app name from "PetCare" to "University App" by updating `strings.xml` and ensuring consistency in the manifest.
- **Git Management:** Resolved merge conflicts, handled swap files, and successfully synced the local repository with the remote GitHub repo.
- **Build Troubleshooting:** Aimed to identify and fix a build failure (ongoing effort as of April 10, 2025).
- **Documentation:** Created this detailed README to outline the project’s purpose, setup, and usage.

The core development involved adapting an Android project structure, ensuring proper version control, and preparing it for further feature implementation.

## Objective
The primary objective of **University App** is to provide a user-friendly mobile solution for university students. Key goals include:
- Simplifying task management by offering a centralized platform for tracking assignments, exams, and class schedules.
- Enhancing accessibility to university resources like lecture notes or campus maps.
- Serving as a learning exercise in Android development, Git workflows, and project documentation.
- Eventually evolving into a fully functional app with features tailored to student feedback and needs.

This project demonstrates practical skills in mobile app development while addressing real-world challenges faced by students.

## How to Build and Run the Application

### Prerequisites
Before setting up the project, ensure you have the following installed:
- **Android Studio**: Version 4.0 or later (e.g., Android Studio Flamingo | 2022.2.1 or newer recommended).
- **Java Development Kit (JDK)**: JDK 11 or higher.
- **Git**: For cloning the repository.
- **Android SDK**: Compatible with API level 21 (Android 5.0 Lollipop) or higher.
- An Android emulator or physical device running Android 5.0+.

### Dependencies
The project relies on standard Android libraries and possibly additional ones depending on its features. Common dependencies (to be confirmed once the build is analyzed) may include:
- **AndroidX Libraries**: For modern Android component support.
  `gradle
  
  Materials components: for UI design
implementation 'com.google.android.material:material:1.9.0'
Check app/build.gradle for the full list once the project is accessible.
Setup Instructions
Follow these steps to set up and run the application locally:

Clone the Repository:
Open a terminal or PowerShell and run:
bash


git clone https://github.com/shre-1/PetCareAssessment2.git
cd PetCareAssessment2
This downloads the project to your local machine.
Open in Android Studio:
Launch Android Studio.
Select "Open an existing project" and navigate to the cloned PetCareAssessment2 folder.
Click "Open" to load the project.

Sync Gradle:
Once the project loads, click "Sync Project with Gradle Files" (an icon with two arrows in a circle) in the toolbar.
Android Studio will download necessary dependencies listed in build.gradle.

Configure an Emulator or Device:
Emulator: In Android Studio, go to Tools > Device Manager, create a virtual device (e.g., Pixel 6 with API 33), and start it.
Physical Device: Enable Developer Options and USB Debugging on your Android phone, then connect it via USB.

Build the Project:
Click Build > Make Project or press Ctrl+F9.
Resolve any build errors (if present) by checking the "Build" output window. (Note: Build failure is under investigation.)

Run the Application:
Click the green "Run" button (triangle) or press Shift+F10.
Select your emulator or connected device to deploy the app.
The app should launch, displaying "University App" on the launcher screen.

Troubleshooting
Gradle Sync Fails: Ensure your internet connection is active and the Android SDK is updated via SDK Manager.

Build Errors: Check for missing dependencies or syntax errors in build.gradle or Java/Kotlin files.

App Crashes: Review Logcat in Android Studio for stack traces.

Project Details

Language: Java or Kotlin (to be confirmed based on source files).

Structure: Follows standard Android architecture with activities, layouts, and resources.

Status: As of April 10, 2025, the project is in development with a pending build fix.

This app is a work in progress, initially scoped for pet care but pivoted to serve university students. Future enhancements could include push notifications for deadlines, a calendar integration, or a student forum.

Conclusion
UniversityAppAssessment2 represents a practical exploration into Android app development, version control with Git, and project management. While it began as "PetCareAssessment2," the shift to "University App" aligns it with a broader, more relatable use case for students. The process of renaming, syncing with GitHub, and documenting the project has been a valuable learning experience, highlighting the importance of adaptability and clear communication in software development.

Once the build issue is resolved, this app has the potential to evolve into a robust tool for university life. Contributions or feedback are welcome—feel free to fork the repo, submit pull requests, or raise issues on GitHub. The journey from a basic concept to a functional app underscores the iterative nature of coding and the power of open-source collaboration. 

ABOUT THE PROJECT (QUICK OVERVIEW)

📱 Features

- 🔐 User Authentication (Login/Signup)
- 📋 Dashboard with user-specific data
- 🗓️ View class schedules and announcements
- 📊 Manage courses and attendance
- 🌐 API Integration for real-time data
- 🧩 Clean Architecture with Dependency Injection (Hilt)
- 🧪 Unit testing included
- 🛠️ MVVM Architecture

🛡️ Requirements
Android Studio Giraffe or higher

Kotlin 1.8+

Gradle 8.0+

Minimum SDK 21+

🤝 Contributing
Contributions are welcome!
If you find any issues or want to improve the project, feel free to open a pull request.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

🙌 Acknowledgements
Thanks to open-source libraries and contributors!

Special mention: VU-NIT3213 API for backend integration.


For any questions or support, reach out via GitHub issues or directly explore the code at https://github.com/shre-1/University-App

Happy coding, and here’s to making university life a little easier!
