import React from 'react'
import { Link } from 'react-router-dom'

type Props = {}

const NavBarComponent = (props: Props) => {
  return (
    <nav>
        <section>
            <Link to="/">Login</Link>
            <Link to="/sobre">Sobre</Link>
        </section>
    </nav>
  )
}

export default NavBarComponent