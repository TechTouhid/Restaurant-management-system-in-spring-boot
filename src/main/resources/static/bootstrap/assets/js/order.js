function total1() {
    let Quantity = parseInt(document.getElementById("Quantity").value);
    let Price = parseInt(document.getElementById("Price").value);

    document.getElementById("Total").value = Price * Quantity;

}
function get_id(clicked_id)
{
    alert(clicked_id);
}
var product_price = 0;
function setProductPrice(price) {
    product_price = price
}

function addRow() {


    let ProductType = document.getElementById('ProductType').value;
    let Product = document.getElementById('Product').value;
    let Quantity = document.getElementById('Quantity').value;
    let Price = document.getElementById('Price').value;
    let Total = document.getElementById('Total').value;

    let table = document.getElementsByTagName('table')[1];

    let newRow = table.insertRow(table.rows.length / 2 + 1);

    let cal0 = newRow.insertCell(0);
    let cal1 = newRow.insertCell(1);
    let cal2 = newRow.insertCell(2);
    let cal3 = newRow.insertCell(3);
    let cal4 = newRow.insertCell(4);
    let cal5 = newRow.insertCell(5);


    cal0.innerHTML = ProductType;
    cal1.innerHTML = Product;
    cal2.innerHTML = Quantity;
    cal3.innerHTML = Price;
    cal4.innerHTML = Total;
    cal5.innerHTML = '<button onclick="productDelete(this)" class="btn btn-danger" name="button1" value="Delete" ">Delete</button>';

}

function productDelete(ctl) {
    $(ctl).parents("tr").remove();
}