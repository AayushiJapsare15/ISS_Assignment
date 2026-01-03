function validateForm() {

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let age = document.getElementById("age").value;
    let course = document.getElementById("course").value;
    let terms = document.getElementById("terms").checked;
    let error = document.getElementById("error");

    error.innerHTML = "";

    if (name.length < 3) {
        error.innerHTML = "Name must be at least 3 characters";
        return false;
    }

    if (!email.includes("@")) {
        error.innerHTML = "Invalid email format";
        return false;
    }

    if (password.length < 6) {
        error.innerHTML = "Password must be at least 6 characters";
        return false;
    }

    if (password !== confirmPassword) {
        error.innerHTML = "Passwords do not match";
        return false;
    }

    if (age < 18) {
        error.innerHTML = "Age must be 18 or above";
        return false;
    }

    if (course === "") {
        error.innerHTML = "Please select a course";
        return false;
    }

    if (!terms) {
        error.innerHTML = "You must accept terms & conditions";
        return false;
    }

    alert("Registration Successful!");
    return true;
}
 