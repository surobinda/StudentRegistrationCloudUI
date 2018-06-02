package cloud.student.registration.ui.studentregistrationcloudui.service;

import org.junit.Assert;
import org.junit.Test;

public class StudentRegistrationServiceTest {

    @Test
    public void test_getNextStudentIdReturnsNextAvailableId() {
        int newStudentId = StudentRegistrationService.getNextStudentId(1);
        Assert.assertEquals(newStudentId, 2);
    }
}
