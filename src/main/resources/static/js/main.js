/* select style begin */
$('.select').each(function() {
  const _this = $(this),
      selectOption = _this.find('option'),
      selectOptionLength = selectOption.length,
      selectedOption = selectOption.filter(':selected'),
      duration = 300; // длительность анимации 

  _this.hide();
  _this.wrap('<div class="select"></div>');
  $('<div>', {
      class: 'new-select',
      text: _this.children('option:disabled').text()
  }).insertAfter(_this);

  const selectHead = _this.next('.new-select');
  $('<div>', {
      class: 'new-select__list'
  }).insertAfter(selectHead);

  const selectList = selectHead.next('.new-select__list');
  for (let i = 1; i < selectOptionLength; i++) {
      $('<div>', {
          class: 'new-select__item',
          html: $('<span>', {
              text: selectOption.eq(i).text()
          })
      })
      .attr('data-value', selectOption.eq(i).val())
      .appendTo(selectList);
  }

  const selectItem = selectList.find('.new-select__item');
  selectList.slideUp(0);
  selectHead.on('click', function() {
      if ( !$(this).hasClass('on') ) {
          $(this).addClass('on');
          selectList.slideDown(duration);

          selectItem.on('click', function() {
              let chooseItem = $(this).data('value');

              $('select').val(chooseItem).attr('selected', 'selected');
              selectHead.text( $(this).find('span').text() );

              selectList.slideUp(duration);
              selectHead.removeClass('on');
          });

      } else {
          $(this).removeClass('on');
          selectList.slideUp(duration);
      }
  });
});
/* select style end */
// function subcategory(id) {
//     var subcategory;
//     var bool2 = true;
//     for (key in map) {
//         if (map.hasOwnProperty(key) && map[key].parentsId === id) {
//             if (bool2) {
//                 subcategory += "<option disabled selected>" + map[key].category + "</option>";
//                 bool2 = false;
//             }
//             subcategory += "<option>" + map[key].category + "</option>";
//             console.log("Ключ = " + key);
//             console.log("Значение = " + map[key].id + ' ' + map[key].category + ' ' + map[key].parentsId);
//         }
//     }
//     $("#subcategory").append(subcategory);
// }

// premium-announcements slider begin
$('#premium-announcements-slider').slick({
  slidesToShow: 4,
  slidesToScroll: 1,
  autoplay: true,
  autoplaySpeed: 2000,
  prevArrow: '<i class="fa fa-chevron-circle-left slick-slider-prev"></i>',
  nextArrow: '<i class="fa fa-chevron-circle-right slick-slider-next"></i>',
  responsive: [
    {
      breakpoint: 992,
      settings: {
        slidesToShow: 3
      }
    },
    {
      breakpoint: 768,
      settings: {
        slidesToShow: 2
      }
    },
    {
      breakpoint: 576,
      settings: {
        slidesToShow: 1
      }
    }
  ]
});
// premium-announcements slider end 


// show select begin
let selectLeft = $('#formBlockSelectLeft').children("select");
$(selectLeft).change(function() {
  $('#formBlockSelectRight').css("display","block");
});
// let selectRight = $('#formBlockSelectRight').css("display","block");
// show select end

