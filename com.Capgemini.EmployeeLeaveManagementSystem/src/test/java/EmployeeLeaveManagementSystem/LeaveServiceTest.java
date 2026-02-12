package EmployeeLeaveManagementSystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeaveServiceTest {

    private Employee employee;
    private LeaveService leaveService;

    @BeforeEach
    void setup() {
        employee = new Employee("E101", "Vivek", "IT", 20, 10);
        leaveService = new LeaveService();
    }


    @Test
    void testAvailableLeaveBalance() {
        int availableLeaves = leaveService.getAvailableLeaves(employee);
        assertEquals(10, availableLeaves);
    }


    @Test
    void testApproveLeave() {
        boolean result = leaveService.applyLeave(employee, 5);
        assertTrue(result);
    }


    @Test
    void testRejectLeave() {
        boolean result = leaveService.applyLeave(employee, 15);
        assertFalse(result);
    }


    @Test
    void testRemainingLeaveAfterApproval() {
        leaveService.applyLeave(employee, 5);
        int remainingLeaves = leaveService.getRemainingLeaves(employee);
        assertEquals(5, remainingLeaves);
    }


    @Test
    void testInvalidLeaveRequest() {
        assertThrows(IllegalArgumentException.class,
                () -> leaveService.applyLeave(employee, -2));
    }
}
