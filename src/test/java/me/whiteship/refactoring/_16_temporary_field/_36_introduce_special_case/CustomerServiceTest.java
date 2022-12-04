package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerServiceTest {
    CustomerService customerService = new CustomerService();
    Customer unknown = new Customer("unknown", null, null);
    BillingPlan keesunBillingPlan = new BillingPlan();
    Customer keesun = new Customer("keesun", keesunBillingPlan, new PaymentHistory(1));

    @Test
    void customerName() {
        String customer = customerService.customerName(new Site(keesun));
        assertEquals(customer, "keesun");

        String unknownCustomer = customerService.customerName(new Site(unknown));
        assertEquals(unknownCustomer, "occupant");

    }

    @Test
    void billingPlan() {
        assertTrue(customerService.billingPlan(new Site(unknown)) instanceof BasicBillingPlan);
        assertEquals(customerService.billingPlan(new Site(keesun)),  keesunBillingPlan);
    }

    @Test
    void weeksDelingquent() {
        assertEquals(customerService.weeksDelinquent(new Site(keesun)),  1);
        assertEquals(customerService.weeksDelinquent(new Site(unknown)),  0);

    }


}