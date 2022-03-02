package main.services;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class piService
{
  private String input = "no input yet...";

  public piService()
  {
    start();
  }

  private void start()
  {
    Thread t = new Thread(() -> {
      while (true)
      {
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();

        if (input.equals("exit")) return;
      }
    });

    t.start();
  }

  public String getInput()
  {
    return input;
  }
}
