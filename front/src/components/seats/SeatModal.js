import React from 'react';
import '../../css/seats/SeatModal.css'

const SeatModal = ({handleModal}) => {
    return (
        <div className='seat_modal_wrap'>
            <p>예약 정보가 없습니다. </p>
            <p>상영 시간 예매 페이지로 이동하세요</p>
            <button onClick={handleModal}>확인</button>
        </div>
    );
};

export default SeatModal;