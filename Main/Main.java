package com.Jashwanth.Main;
import java.io.IOException;

import static com.Jashwanth.CommandExecuter.CommandExecuter.executeCommand;
import static com.Jashwanth.GitCommands.GitCommands.addAll;
import static com.Jashwanth.GitCommands.GitCommands.push;
import static com.Jashwanth.GitCommands.GitCommands.pushBranch;
import static com.Jashwanth.GitCommands.GitCommands.addSpecificFile;
import static com.Jashwanth.GitCommands.GitCommands.createBranch;
import static com.Jashwanth.GitCommands.GitCommands.commit;
import static com.Jashwanth.GitCommands.GitCommands.cherryPick;
import static com.Jashwanth.GitCommands.GitCommands.pull;
import static com.Jashwanth.GitCommands.GitCommands.addCredentials;
import static com.Jashwanth.GitCommands.GitCommands.merge;
import static com.Jashwanth.GitCommands.GitCommands.log;
import static com.Jashwanth.GitCommands.GitCommands.status;
import static com.Jashwanth.GitCommands.GitCommands.branchShift;
import static com.Jashwanth.GitCommands.GitCommands.initializeGitRepo;
import static com.Jashwanth.GitCommands.GitCommands.createRemote;
import static com.Jashwanth.GitCommands.GitCommands.createFile;
import static com.Jashwanth.GitCommands.GitCommands.fetch;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        initializeGitRepo();
        createRemote(" https://Jashwanth_Mallela@bitbucket.org/jashwanth2003/gripongit.git");
        String branchName = "branch2";
        createBranch(branchName);
        pushBranch("origin",branchName);
        branchShift(branchName);
        String file = "baahubaliFile.txt";
        createFile(file);
        addSpecificFile(file);
        commit(file+" is added");
        branchShift("master");
        merge(branchName);
        push();
    }
}
