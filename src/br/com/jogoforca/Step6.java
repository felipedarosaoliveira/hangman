package br.com.jogoforca;

public class Step6 implements StepFork{
    @Override
    public void printStep() {
        String step = """
                         -----------------------|
                         |                      |
                         |                     _____   
                         |                    | 0 0 |
                         |                    |  s  |
                         |                    | --- |
                         |                       |
                         |                    ________
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

