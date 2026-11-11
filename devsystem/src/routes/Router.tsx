import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Login from '../pages/Login/Login'
import Sobre from '../pages/Sobre/Sobre'
import NotFound from '../pages/NotFound/NotFound'
import NavBarComponent from '../components/NavBar/NavBarComponent'

type Props = {}

const Router = (props: Props) => {
  return (
    <BrowserRouter>
        <NavBarComponent />
        <Routes>
            <Route path='/' element={<Login />}/>
            <Route path='/sobre' element={<Sobre />}/>
            <Route path='*' element={<NotFound />}/>
        </Routes>
    </BrowserRouter>
  )
}

export default Router