
# Exercise 0: Making a github account and links

Open up (github)[https://github.com/] on your browser and create a new account. There are some images below to help out.

!(home)[https://github.com/em1e/java_practice/blob/main/images/github_home.png]
!(new account creation)[https://github.com/em1e/java_practice/blob/main/images/new_account.png]

for the following execises some useful links include:
- (what are git and github?)[https://www.youtube.com/watch?v=DVRQoVRzMIY]
- (oh shit git!)[https://ohshitgit.com/]
- (how git works?)[https://www.atlassian.com/git]
- (git commands)[https://www.atlassian.com/git/glossary#commands]
- (what is ssh?)[https://www.techtarget.com/searchsecurity/definition/Secure-Shell]


# Exercise 1: Create an ssh key, create your first repo and push local changes 

Create an ssh key, and link it to your github. There is a step by step youtube tutorial on how to do this, as well as the documentation used in the video linked below.

- (step by step tutorial to ssh)[https://www.youtube.com/watch?v=snCP3c7wXw0]
- (generate an ssh key, document)[https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent]
- (adding a ssh key to github, document)[https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account]


# Exercise 2: Create your first repo and push local changes

In this exercise you are supposed to create a repository and understand what git and github really are, and how to use them. It is highly sugegsted to complete the terminal exercises first, so that you have an understand on what it is and won't get overwhelmed.

*step 1.* Create a repository called `my-first-repo` 
- make the repo public
- add a readme.md file

*step 2.* Clone the repo using the ssh tab
copy the link through
!(ssh github)[https://github.com/em1e/java_practice/blob/main/images/ssh.png]
and run:
```
git clone <link>
cd my-first-repo
```

*step 3.* Create a .txt file or text file into the folder
You can write whatever you want into it, just write something.

*step 4.* add, commit and push.
Using the instructions in above and online, try to figure out how this is done and successfully push your local changes into your github repository online.

!(local vs remote)[https://github.com/em1e/java_practice/blob/main/images/Github-local-vs-remote.jpg]

# Exercise 3: Forks

Using knowledge from exercise 2, you can now go to (java_practice repo)[https://github.com/em1e/java_practice] and fork it.
- forks are clones off of repositories from other people.

!(fork)[https://github.com/em1e/java_practice/blob/main/images/fork.png]

> [!NOTE]
> Keep in mind to create branches and push the changes into them.

<details>
<summary>What are git and github? and how to use them?</summary>

## What are they?
GitHub is a developer platform that allows developers to create, store, manage and share their code. While Git is a distributed version control system that tracks versions of files.

(Watch this and ask questions if something is unclear)[https://www.youtube.com/watch?v=DVRQoVRzMIY]. 

</details>