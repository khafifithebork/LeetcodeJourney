<div align="center">

# 🧠 LeetCode Solutions

![LeetCode Sync](https://img.shields.io/badge/Sync-Automated-brightgreen?style=for-the-badge&logo=github-actions)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)
![GitHub last commit](https://img.shields.io/github/last-commit/khafifithebork/leetcode?style=for-the-badge&logo=git&logoColor=white)

**My personal collection of LeetCode solutions, automatically synced via GitHub Actions.**

[LeetCode Profile](https://leetcode.com/) · [View Solutions](#-solutions) · [How It Works](#-how-it-works)

</div>

---

## 📊 Stats

| Metric         | Status |
|----------------|--------|
| **Easy**       | ✅ In Progress |
| **Medium**     | 🔶 In Progress |
| **Hard**       | 🔴 In Progress |
| **Sync**       | 🤖 Automated  |

---

## 📁 Repository Structure

```
📦 leetcode
├── 📂 .github/workflows
│   └── 📄 leetcode-sync.yml   # GitHub Actions workflow
├── 📂 solutions               # Auto-synced solutions
│   ├── 📄 1-two-sum.py
│   ├── 📄 2-add-two-numbers.py
│   └── ...
└── 📄 README.md
```

---

## 🔄 How It Works

This repository uses the [**LeetCode Sync**](https://github.com/joshcai/leetcode-sync) GitHub Action to automatically sync accepted LeetCode submissions to this repo.

- ⏰ **Schedule**: Syncs every **Saturday at 8:00 AM UTC** (configurable via cron)
- 🖱️ **Manual Trigger**: Can also be triggered manually from the **Actions** tab
- 🔒 **Secure**: LeetCode credentials are stored as encrypted GitHub Secrets

---

## ⚙️ Setup Guide

Want to set up your own? Follow these steps:

### 1. Get Your LeetCode Cookies

1. Log in to [leetcode.com](https://leetcode.com)
2. Open **Developer Tools** (`F12` or `Ctrl+Shift+I`)
3. Go to **Application** → **Cookies** → `https://leetcode.com`
4. Copy the values for:
   - `csrftoken` → This is your **CSRF Token**
   - `LEETCODE_SESSION` → This is your **Session Token**

### 2. Add GitHub Secrets

Go to your repo → **Settings** → **Secrets and variables** → **Actions**, and add:

| Secret Name             | Value                        |
|-------------------------|------------------------------|
| `LEETCODE_CSRF_TOKEN`   | Your `csrftoken` cookie      |
| `LEETCODE_SESSION`      | Your `LEETCODE_SESSION` cookie |

### 3. Enable the Workflow

The workflow file at `.github/workflows/leetcode-sync.yml` will automatically run on schedule. You can also trigger it manually:

1. Go to the **Actions** tab in your repository
2. Select **Sync Leetcode**
3. Click **Run workflow**

---

## 🛠️ Technologies

<p align="center">
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white" />
  <img src="https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=white" />
</p>

---

## 📜 License

This project is open source and available under the [MIT License](LICENSE).

---

<div align="center">

**⭐ Star this repo if you find it useful!**

Made with ❤️ and lots of ☕

</div>
