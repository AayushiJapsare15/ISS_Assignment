function loginValidate() {
    let u = document.getElementById("user").value;
    let p = document.getElementById("pass").value;

    if (u === "" || p === "") {
        alert("Fields cannot be empty");
        return false;
    }
    return true;
}

function registerValidate() {
    let u = document.getElementById("ruser").value;
    let p = document.getElementById("rpass").value;

    if (u.length < 3 || p.length < 3) {
        alert("Minimum 3 characters required");
        return false;
    }
    return true;
}
