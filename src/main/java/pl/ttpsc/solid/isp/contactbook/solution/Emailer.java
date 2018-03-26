package pl.ttpsc.solid.isp.contactbook.solution;

class Emailer {
    public void sendMessage(IEmailable emailable, String subject, String body) {

        String emailAddress = emailable.getEmailAddress();

        sendEmail(emailAddress, subject, body);
    }

    private void sendEmail(String emailAddress, String subject, String body) {
        // TODO Auto-generated method stub

    }
}