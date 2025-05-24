# 🍴 Online Food Delivery Application

A full-stack web application for online food ordering and delivery with separate interfaces for Admin and Customer. Built using **Spring Boot**, **React.js**, **MongoDB**, **JWT Authentication**, and **AWS S3** for image storage.

---

## 🚀 Tech Stack

### 🔧 Backend
- Java + Spring Boot
- MongoDB (NoSQL Database)
- Spring Security with JWT Authentication
- AWS S3 (Image Uploads)
- Razorpay (Payment Gateway)

### 🎨 Frontend
- React.js (Admin & Customer Panels)
- Axios (API Communication)
- React Router DOM
- Tailwind CSS (Optional for styling)

---

## 🧩 Features

### 👤 User Authentication
- JWT-based secure login system
- Role-based access: Admin vs Customer
- Passwords securely stored and authenticated

---

### 🧑‍💼 Admin Panel
- Secure Admin Login
- **Food Management**:
  - Add, Edit, Delete food items
  - Upload food images to AWS S3
- **Order Management**:
  - View all customer orders
  - Change order status
- Dashboard with total orders and earnings
- Sidebar navigation across views

---

### 👥 Customer Panel
- Registration and Login
- Browse food items (with filtering/search)
- Add to Cart / Remove from Cart
- View and manage cart
- Place Orders
- View order history
- Razorpay integration for payments (if enabled)

---

### 🗄️ Backend APIs

#### Authentication
- `POST /api/auth/register`
- `POST /api/auth/login`
- `GET /api/user/me` (JWT required)

#### Food
- `GET /api/foods` – Get all foods
- `POST /api/foods` – Add new food (Admin only)
- `PUT /api/foods/{id}` – Update food
- `DELETE /api/foods/{id}` – Delete food

#### Cart
- `POST /api/cart/add` – Add food to cart
- `DELETE /api/cart/remove/{foodId}` – Remove item
- `GET /api/cart` – Get current user cart
- `DELETE /api/cart/clear` – Clear cart

#### Orders
- `POST /api/orders/place` – Place order from cart
- `GET /api/orders/mine` – Get user's orders
- `GET /api/orders/all` – Get all orders (Admin)

---

## 🌩 AWS S3 Integration
- Food images are uploaded to AWS S3 using the backend.
- The image URL is saved in MongoDB and displayed in both admin and customer panels.

---

## 💳 Payment Integration (Razorpay)
- Razorpay API integration for order payments.
- Frontend generates a Razorpay order on checkout.
- Backend verifies payment and finalizes the order.

---

## 🔐 Security
- All protected endpoints require a valid JWT token.
- JWT included in headers using Axios for secure communication.
- Spring Security handles access control based on roles.

---
## 🛠️ How to Run Locally

### Backend
```bash
cd backend
./mvnw spring-boot:run
---

### Frontend (Admin & Customer)
bash
Copy
Edit
cd frontend-admin
npm install
npm start

cd ../frontend-customer
npm install
npm start
