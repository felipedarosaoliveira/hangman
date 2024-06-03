package br.com.jogoforca;

public class Step7 implements StepFork{
    @Override
    public void printStep() {
        String step = """
                         -----------------------|
                         |                      |
                         |                      *   _____
                         |                      * / * *  /
                         |                      */  ~   /
                         |                     */ \\_\\  /
                         |                      **** 
                         |                    ____|____
                         |                    |      |
                         |                   /|      |\\
                         |                \\/  |      |  \\/
                         |                    |      |
                         |                    ________
                         |                     |    |
                         |                     |    |
                       -----                  _|    |_
                       |   |
                    ----------
                    |        |
                    ----------
                """;
        System.out.println(step);
    }

}

