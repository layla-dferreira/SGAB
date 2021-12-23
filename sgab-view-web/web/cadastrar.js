let expandirEl = document.querySelector("#expandir");
let tagsEl = document.querySelector("#tags");

expandirEl.addEventListener("click", e => {
    tagsEl.classList.toggle("visivel");
})