package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class AlertNotificationServer implements NotificationService{
    private AlertService alertService;

    public AlertNotificationServer(AlertService alertService) {
        this.alertService = alertService;
    }

    @Override
    public void setNotification(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle() + " is shipped");
        alertMessage.setFor(notification.getReceiver());
        alertService.add(alertMessage);

    }
}
