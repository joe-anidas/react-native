
## 📘 React Native App (Expo + Navigation)

This is a React Native Expo project with **4 navigable screens**:  
✅ BMI Calculator  
✅ Expense Manager  
✅ Metric Converter  
✅ To-do List  

---

## 🧾 Project Structure

```
yourproject/
├── App.js
├── index.tsx
├── screens/
│   ├── Home.js
│   ├── BMI.js
│   ├── Expense.js
│   ├── Metric.js
│   └── Todo.js
```

---

## 🚀 Installation & Setup

### 1. Create Expo Project
```bash
npx create-expo-app yourproject
cd yourproject
```

### 2. Install Navigation Dependencies
```bash
npx expo install @react-navigation/native
npx expo install react-native-screens react-native-safe-area-context react-native-gesture-handler react-native-reanimated
npm install @react-navigation/native-stack
```

---

## 📂 Files Overview

### `index.tsx`
```ts
import { registerRootComponent } from 'expo';
import App from './App';

registerRootComponent(App);
```

---

## ✅ Run the App

```bash
npx expo start
```

Scan the QR code with Expo Go app on your phone.

---
