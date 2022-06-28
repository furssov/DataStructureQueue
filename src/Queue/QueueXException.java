package Queue;

import java.io.IOException;

public class QueueXException extends IOException {
    public QueueXException()
    {

    }
    public QueueXException(String message)
    {
       super(message);
    }

    public QueueXException(String message, Throwable throwable)
    {
      super(message, throwable);
    }

    public QueueXException(Throwable throwable)
    {
        super(throwable);
    }
}
