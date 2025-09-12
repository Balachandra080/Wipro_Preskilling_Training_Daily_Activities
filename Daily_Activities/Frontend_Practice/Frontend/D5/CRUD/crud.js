window.onload = function () {
    loadUsers();

    // Bind form submit event for updating users
    document.getElementById("updateForm").addEventListener("submit", updateUser);
};

function loadUsers() {
    const apiUrl = "https://jsonplaceholder.typicode.com/users";

    document.getElementById("loading-list").classList.remove("d-none");

    var userList = document.getElementById("users-list");
    var rows = "";

    $.ajax({
        url: apiUrl,
        method: "GET",
        dataType: "json",
        success: function (data) {
            data.forEach(temp => {
                rows += `<tr>
                    <td>${temp.username}</td>
                    <td>${temp.company.name}</td>
                    <td>${temp.address.city}</td>
                    <td>${temp.address.zipcode}</td>
                    <td>
                        <button type="button" class="btn btn-danger btn-sm" onClick="deleteUser(${temp.id})">Delete</button>
                        <button type="button" class="btn btn-warning btn-sm" onClick="editUser(${temp.id})">Edit</button>
                    </td>
                </tr>`;
            });
            userList.innerHTML = rows;

            document.getElementById("loading-list").classList.add("d-none");
        },
        error: function (error) {
            console.error(error);
            document.getElementById("loading-list").classList.add("d-none");
        }
    });
}

function deleteUser(id) {
    var userConfirmation = confirm("Are you sure to delete this user?");
    if (userConfirmation) {
        const apiUrl = `https://jsonplaceholder.typicode.com/users/${id}`;

        $.ajax({
            url: apiUrl,
            method: "DELETE",
            success: function () {
                alert("User deleted successfully");
                loadUsers();
            },
            error: function (error) {
                console.log(error);
            }
        });
    } else {
        alert("Delete cancelled by user");
    }
}

function editUser(id) {
    const apiUrl = `https://jsonplaceholder.typicode.com/users/${id}`;

    $.ajax({
        url: apiUrl,
        method: "GET",
        success: function (userInfo) {
            document.getElementById("userId").value = userInfo.id; 
            document.getElementById("username").value = userInfo.username;
            document.getElementById("companyname").value = userInfo.company.name;
            document.getElementById("city").value = userInfo.address.city;
            document.getElementById("zipcode").value = userInfo.address.zipcode;
        },
        error: function (error) {
            console.error(error);
        }
    });
}

function updateUser(event) {
    event.preventDefault();

    var id = document.getElementById("userId").value; 
    const apiUrl = `https://jsonplaceholder.typicode.com/users/${id}`;

    var username = document.getElementById("username").value;
    var companyname = document.getElementById("companyname").value;
    var city = document.getElementById("city").value;
    var zipcode = document.getElementById("zipcode").value;

    var jsonObject = {
        username: username,
        company: { name: companyname },
        address: { city: city, zipcode: zipcode }
    };

    $.ajax({
        url: apiUrl,
        method: "PUT",
        data: JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function () {
            alert("User updated successfully");
            loadUsers();
        },
        error: function (error) {
            console.log(error);
        }
    });
}

function addUser(event) {
    event.preventDefault();
    alert("Adding user...");
    const url = "https://jsonplaceholder.typicode.com/users/";

    var username = document.getElementById("username").value;
    var companyname = document.getElementById("companyname").value;
    var city = document.getElementById("city").value;
    var zipcode = document.getElementById("zipcode").value;

    var jsonObject = {
        username: username,
        company: { name: companyname },
        address: { city: city, zipcode: zipcode }
    };

    $.ajax({
        url: url,
        method: "POST",
        data: JSON.stringify(jsonObject),
        contentType: "application/json",
        success: function () {
            alert("New user added");
            loadUsers();
        },
        error: function (error) {
            console.log(error);
        }
    });
}
