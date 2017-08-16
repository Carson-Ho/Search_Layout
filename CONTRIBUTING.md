# Contributing Guide
- First,Thank you for your attention to this project. 
- Any bug, doc, examples and suggestion is appreciated. Here are some suggestions for you to create Pull Requests or open Issues.



## 1. Branches Description
- master branch：the latest (pre-)release branch.
- develop branch：the stable developing branch. 
>1. [Github Release](https://help.github.com/articles/creating-releases/) is used to publish a (pre-)release version to master branch.
>2. It's RECOMMENDED to commit bugfix or feature PR to develop.

- {action}/{description} branch:The branch for a developing or bugfix *. 
>DO NOT commit any PR to such a branch.


## 2.  Branch Management

>master
 ↑
develop         <--- PR(bugfix/typo/3rd-PR)
 ↑ PR
{type}/{description}



## 3.  Branch Name

```
{action}/{description}

// 1. {action}:
    // feature: used for developing a new feature.
    // bugfix: used for fixing bugs.
// 2. for example: feature/add_new_condition
```

## 4. Commit Log
```
{action} {description}
```

- {action}
  1. add
  2. update or bugfix
  3. remove
...

- {description}：It's ***RECOMMENDED*** to close issue with syntax #123, see [the doc](https://help.github.com/articles/closing-issues-via-commit-messages/) for more detail. 
>It's useful for responding issues and release flow.

- for example

```
add new condition
fix #123, make compatible to recyclervew 25.2.0
remove abc
```

## 5.  Issue
- Please apply a proper label to an issue.
- Suggested to use English.
- Provide sufficient instructions to be able to reproduce the issue and make the issues clear. Such as phone model, system version, sdk version, crash logs and screen captures.


## 6.  Pull Request And Contributor License Agreement
- In order to contribute code to Kawaii_LoadingView, you (or the legal entity you represent) must sign the Contributor License Agreement (CLA).
- For CLA assistant service works properly, please make sure you have added email address that your commits linked to GitHub account.

### 7.  Code Style Guide
- Java：Use [Google Java Style](https://google.github.io/styleguide/javaguide.html) as basic guidelines of java code.
- Android：Follow [AOSP Code Style](https://source.android.com/source/code-style.html) for rest of android related code style.
