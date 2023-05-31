package com.Jashwanth.GitCommands;


import java.io.IOException;

import static com.Jashwanth.CommandExecuter.CommandExecuter.executeCommand;

public class GitCommands {
   public static void initializeGitRepo() throws IOException,InterruptedException{
       executeCommand("git","init");
   }
    public static void createRemote(String repoLink) throws IOException,InterruptedException{
        executeCommand("git","remote","add","origin",repoLink);
    }
    public static void createFile(String fileName) throws IOException,InterruptedException{
        executeCommand("cmd","/c","echo.",">",fileName);
    }
    public static void createBranch(String branchName) throws IOException,InterruptedException{
        executeCommand("git","branch",branchName);
    }
    public static void branchShift(String branchName) throws IOException,InterruptedException{
        executeCommand("git","checkout",branchName);
    }
    public static void push() throws IOException,InterruptedException{
        executeCommand("git","push");
    }
    public static void addCredentials(String email,String name) throws IOException,InterruptedException{
        executeCommand("git","config","--global","user."+email,"email");
        executeCommand("git","config","--global","user."+name,"name");
    }
    public static void pull() throws IOException,InterruptedException{
        executeCommand("git","pull");
    }
    public static void fetch() throws IOException,InterruptedException{
        executeCommand("git","fetch");
    }
    public static void addSpecificFile(String fileName) throws IOException,InterruptedException{
        executeCommand("git","add",fileName);
    }
    public static void addAll() throws IOException,InterruptedException{
        executeCommand("git","add",".");
    }
    public static void commit(String message) throws IOException,InterruptedException{
        executeCommand("git","commit","-m",message);
    }
    public static void merge(String branchName) throws IOException,InterruptedException{
        executeCommand("git","merge",branchName);
    }
    public static void status() throws IOException,InterruptedException{
        executeCommand("git","status");
    }
    public static void log(String branchName) throws IOException,InterruptedException{
        executeCommand("git","log");
    }
    public static void cherryPick(String revisionId) throws IOException,InterruptedException{
        executeCommand("git","cherryPick",revisionId);
    }
    public static void pushBranch(String remote,String branchName) throws IOException,InterruptedException{
        executeCommand("git","push","--set-upstream",remote,branchName);
    }
}
