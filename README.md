# My Financial Pal
This project is for our finance management app, My Financial Pal, which acts as our group project for Mobile Programming (IT 3048). Our group consists of [Gage Hafl](https://github.com/haflga), [David Akobia](https://github.com/lucky7Z), [Otti Bensghir](https://github.com/Ottibensghir)

## Design Document
To view our design document, you can click on the document in the list of files above, or [click here](./DESIGN.pdf) once the document is added to this repository.

### Scrum Board (Project Board)
This project is being run on agile development. In order to see the Scrum Board for tasks that we are using, click on the `Projects` tab at the top of the page. Then select the `Dev` project, otherwise, you can just [click here](https://github.com/haflga/finpal/projects/1)

### Tasks (Issues)
The tasks that we have planned for work, are all listed on the projects page under the current status of the task: 'RAID - Blocked' (tasks blocked/waiting on something/someone else), 'To Do' (planned tasks which have not been worked on yet), 'In Progress' (tasks which have been started and are being worked on currently), 'Verify - Code Review' (tasks which should be completed and are being double checked by another member of the project to ensure stable code), and 'Done' (tasks which are completed, tested, and integrated with the main project code. You can view a list of all the issues in our project by clicking the `Issues` tab above here, or [clicking here](https://github.com/haflga/finpal/issues).

### Stories (Milestones)
In agile development, tasks can be tracked through 'stories'. GitHub is capable of this feature through, what they call, Milestones. All of our stores/milestones can be viewed through the Milestones page, which can be found by selecting the `Issues` tab above, and then selecting `Milestones` with the button towards the top right. Otherwise, you can just [click here](https://github.com/haflga/finpal/milestones) to reach the same page. This page can show all of the current overarching tasks, that we have planned and split into smaller tasks to complete. Clicking on any of these milestones can give you a view of the associated work and status.

<br>

---

<br>

## Development Process
This is a section to describe the process for working on this project. This will go over how to start work on the project and how to submit your work to be applied to the master branch of the project.

### Branches
To begin work, you will need to start by creating a new branch. Git uses the `master` branch as default for all changes, however, our project will only commit changes to the `master` branch that have been reviewed to help reduce mistakes/errors. To do this, each bit of work related to a issue/task or milestone/story should be committed on a branch created specifically for that work. When creating these branches you should follow a naming pattern like: `story_(MILESTONE/TASK)`. If the milestone contains enough work, you can create more branches for each sub-task of the milestone. These branches should be named based on the milestone that they relate to, for example, for the `Environment Setup` milestone, [found here](https://github.com/haflga/finpal/milestone/4), the branch is named `story_env_setup`. Following are some of the commands that you need to run to commit work for the project. Make sure you do this __BEFORE__ committing or pushing any of your work.

To create a branch for your milestone work use this command, with BRANCH_NAME replaced with whatever name you want:
`git branch BRANCH_NAME`

Then you can run this command to switch to this branch:
`git checkout BRANCH_NAME`

After checking out the branch, you can run this command to set the branch to push to the correct branch in the public repository, with the BRANCH_NAME replaced with whatever branch name you are using:
`git push --set-upstream-to origin BRANCH_NAME`. After this first push, you can just use `git push` for the rest of the times you are adding work, since it will already know where to push the work.

Whenever you begin working on your branch you should always pull the current branch in order to prevent any issues such as two people changing the same lines of code and Git not being able to automatically manage the conflicts. To do this, just run:
`git pull`, which will automatically pull all of the code from the repository on this site and bring it to your local files. Then you can begin work on your changes. If you forget to do this and work on things, then just run:
`git stash`, to stash your work. Then you can pull with the command above, and then re-apply your work, by using `git stash pop`.

If you want to do any sort of test work on the project before actually committing work on a specific milestone/issue, then you can create a branch with your name at the start followed by whatever you want. This will help make sure all the branches directly related to the milestones will all be easily findable (ie. they should all start with `story_...`) and all of your test/extra work will be organized by name. So, if I wanted to do some random work, not directly related to an issue, just to test something out, I could create a branch `gage_test` containing this work. This way, any branches that I create will show in the list together as `gage_...` and I can easily know who created what extra branches without having to check the commit history, if I have a question about them or something.

### Pull Requests
Once you are finished with all of the work you think needs done for a story/milestone, you can create a pull request to move the code to the review step and have it merged with the `master` branch and the actual current code for the project. To do this, first finish __ALL__ of the work related to your story/milestone/task. Then, once completed, click the `New Pull Request` button at the top of this project's homepage. On the next page make sure the base branch is set to `master` (this should already be selected by default) and the compare branch as whichever branch you pushed your work to. It should then show all of the changes you made below, and you can click the button to create your pull request. Then title the pull request and name it with a short summary on whatever you changed. On the right side, click the button to assign yourself as the person responsible for this work, select Gage Hafl as the requested reviewer, then set the project as "Dev" and the milestone as whichever milestone/story the work was for. Once that is all done, you can finally submit the pull request, and the code will be able to be reviewed to make sure everything is ok.

After you submit this, it will let me know that you want me to review your changes, and I can run through and make sure the code changes look alright to me. I can leave comments asking about certain changes if I am confused, request certain changes if I see something that I know needs changed to something else, or just accept the work and merge it to the master codebase. If you create the pull request and then realize you need to make any changes, just remove me, Gage Hafl, from the reviewer option, so that it will still leave the pull request up, but not ask me to merge anything, and you can continue committing your work to the pull request. Then, once you finish whatever else you had to do, just click the option to select Gage Hafl as the reviewer again and I will be notified to check the code again.
