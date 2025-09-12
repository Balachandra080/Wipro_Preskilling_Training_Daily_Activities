function findDetail() {

    //check the name
    var name = document.getElementById("name").value;
    if(name === "" ){
        alert("Please enter your name");
        return;
    }

    var price = document.getElementById("price").value;
    if(price === "" ){
        alert("Please enter the price");
        return;
    }

    price = parseInt(price);
    if(price <=0){
        alert("Please enter a valid price");
        return;
    }

    var discount = document.getElementById("discount").value;
    if(discount === "" ){
        alert("Please enter the discount");
        return;
    }

    discount = parsedInt(discount)
    if (discount < 0 || discount > 100)
    {
        alert("please enter a discount with in 0 to 100");
        return;
    }

    var tax = document.getElementById("tax").value;
    if(tax === "" ){
        alert("Please enter the tax");
        return;
    }

    tax = parsedInt(tax);
    if(tax == "" || tax < 0 || tax > 100) {
        alert("Please enter a tax within 0 to 100");
        return;
    }

    // Find the product total
    var discountAmount = price * (discount / 100);
    var productPrice = price - discountAmount;
    var taxAmount = productPrice * (tax / 100);
    var total = productPrice + taxAmount;

    document.getElementById("nameTd").innerHTML = name;
    document.getElementById("priceTd").innerText = "Rs. "+price + "/" +scale;
    document.getElementById("discountTd").innerText = discount + "%";
    document.getElementById("taxTd").innerText = tax + "%";
    document.getElementById("totalTd").innerText = "Rs. "+siscount +"only";
}