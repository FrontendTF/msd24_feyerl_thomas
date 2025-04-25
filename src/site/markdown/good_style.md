# Best Practices for Writing Git Commit Messages

Well-structured commit messages help teams work together more effectively, make changes easier to understand, and provide a cleaner project history — especially in collaborative or long-term projects.

---

## Example of a Clean Commit Message

Add Javadoc comments to Calculator class and update .gitignore

- Documented the Calculator class with Javadoc, including fields and methods.
- Adjusted .gitignore to correctly exclude the .vscode folder.

### Best Practices for Commit Messages

- Keep the commit **title under 50 characters**
- If issue numbers exist: **include them!**
- Start your message with a **capital letter**
- Use the **imperative mood** in the commit title  
  e.g., write `Fix bug` instead of `Fixed bug`
- If the change is complex, **add a detailed body** to explain **what** and **why**
- Mention **specific files or components** you changed
- Use a **consistent formatting style** for commits across your project/team to ensure readability and professionalism

## File-Related Best Practices

- **Separate unrelated changes** into individual commits for clarity and better version control.
- Always **test your code** before committing.
- Mention the files or modules affected if the context isn’t obvious.
