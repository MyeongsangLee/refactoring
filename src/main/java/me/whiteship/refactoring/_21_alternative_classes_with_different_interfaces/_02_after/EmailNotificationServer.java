package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces._02_after;

public class EmailNotificationServer implements NotificationService{

    EmailService emailService;

    public EmailNotificationServer(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void setNotification(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle() + " is shipped");
        emailMessage.setTo(notification.getReceiver());
        emailMessage.setFrom(notification.getSender());
        emailService.sendEmail(emailMessage);

    }
}
