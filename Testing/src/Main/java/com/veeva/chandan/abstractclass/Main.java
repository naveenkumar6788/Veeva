package com.veeva.chandan.abstractclass;
// Now, you’re ready to test your application.
// Start by declaring an object of chandan.SendButtonClass.
// Call the setCaption() method to set its caption.
// Assign the recipient's email ID, and put the message to be sent by calling setSendTo() and setMessage() methods. Finally, call the buttonPress() method.

abstract class AbstractButtonClass {
    private String caption;

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }

    public void SetCaption(String caption) {
        setCaption(caption);
    }
}

interface ButtonPress {
    void buttonPress();
}

class SendButtonClass extends AbstractButtonClass implements ButtonPress {
    String sendTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Sending " + this.message + " to " + this.sendTo);
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class Main {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("a@b.com");
        sendButton.setMessage("Hello World");
        sendButton.buttonPress();

        System.out.println("Caption: " + sendButton.getCaption());
    }
}

/*
abstract class chandan.AbstractButtonClass {
    String caption;

    public void SetCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }
}

interface chandan.ButtonPress {
    void buttonPress();
}

class ForwardButtonClass extends chandan.AbstractButtonClass implements chandan.ButtonPress {
    String forwardTo;
    String message;

    @Override
    public void buttonPress() {
        System.out.println("Forwarding " + this.message
                + " to " + this.forwardTo);
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class chandan.Functional_interface.Main {
    public static void main(String[] args) {
        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.SetCaption("Forward");
        forwardButton.setForwardTo("x@y.com");
        forwardButton.setMessage("Hello World");
        forwardButton.buttonPress();
    }
}
*/