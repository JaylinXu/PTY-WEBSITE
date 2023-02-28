// 获取模态框、图片和关闭按钮
var modal = document.getElementById("myModal");
var modalImg = document.getElementById("img01");
var closeBtn = document.getElementsByClassName("close")[0];

// 点击照片弹出模态框
var images = document.getElementsByClassName("gallery-image");
for (var i = 0; i < images.length; i++) {
  images[i].onclick = function() {
    modal.style.display = "block";
    modalImg.src = this.src;
  }
}

// 点击关闭按钮关闭模态框
closeBtn.onclick = function() {
  modal.style.display = "none";
}

// 点击模态框外部区域关闭模态框
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
