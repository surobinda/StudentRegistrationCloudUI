package cloud.student.registration.ui.studentregistrationcloudui.service;

import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationService {
    public static int getNextStudentId(int lastId) {
        return lastId + 1;
    }
}
