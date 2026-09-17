# Publishing and Submission Checklist

## Publish CampusCare to GitHub

1. Sign in to GitHub and create a new repository called `CampusCare`.
2. Choose **Public** visibility. Do not add a README, license, or `.gitignore` on GitHub because this folder already contains them.
3. In a terminal opened inside this project folder, run the commands below. Replace `YOUR-USERNAME` with your GitHub username.

```bash
git add .
git commit -m "Create CampusCare lost-and-found manager"
git remote add origin https://github.com/YOUR-USERNAME/CampusCare.git
git push -u origin main
```

4. Open the repository page in a browser and confirm that `README.md` is visible at the top level and that GitHub marks the repository as Public.

## What to submit

- Repository root URL: `https://github.com/YOUR-USERNAME/CampusCare`
- Do not submit a URL containing `/tree/main`, `/blob`, or a specific file path.
- Submit a structured project report through the course platform alongside the repository URL.

## Before submitting

- Run `javac *.java` and `java CampusCare` from a terminal.
- Capture screenshots of your own runs: main menu, item registration, search, resolution, and report export.
- Read and explain every feature, class, and Java concept in your own words.
- Keep the project relevant to Programming in Java and do not claim features that are not implemented.
