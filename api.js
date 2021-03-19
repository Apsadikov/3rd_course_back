const url = "http://localhost:8080"

async function api(method, endpoint, message, data) {
    try {
        const response = await fetch(url+endpoint, {
            method: method,
            body: data === null? undefined : data
        });
        return await response.json()
    } catch (e) {
        console.error(e.message)
        document.getElementById("status").innerText = "Error in "+ message
    }
}
