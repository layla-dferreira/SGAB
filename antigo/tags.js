const tagContainer = document.querySelector('.tag-container');
const input = document.querySelector('.tag-container input');

let tags = [];

function criarTag(label) {
  const div = document.createElement('div');
  div.setAttribute('class', 'tag');
  const span = document.createElement('span');
  span.innerHTML = label;
  const closeIcon = document.createElement('i');
  closeIcon.innerHTML = 'delete';
  closeIcon.setAttribute('class', 'material-icons');
  closeIcon.setAttribute('data-item', label);
  div.appendChild(span);
  div.appendChild(closeIcon);
  return div;
}

function limparTags() {
  document.querySelectorAll('.tag').forEach(tag => {
    tag.parentElement.removeChild(tag);
  });
}

function adicionarTags() {
  limparTags();
  tags.slice().reverse().forEach(tag => {
    tagContainer.prepend(criarTag(tag));
  });
}

input.addEventListener('keyup', (e) => {
    if(input.value != ''){
        if (e.key === 'Enter') {
        e.target.value.split(',').forEach(tag => {
            tags.push(tag);  
        });
        
        adicionarTags();
        input.value = '';
        }
    }
});
document.addEventListener('click', (e) => {
  console.log(e.target.tagName);
  if (e.target.tagName === 'I') {
    const tagLabel = e.target.getAttribute('data-item');
    const index = tags.indexOf(tagLabel);
    tags = [...tags.slice(0, index), ...tags.slice(index+1)];
    adicionarTags();    
  }
})

input.focus();