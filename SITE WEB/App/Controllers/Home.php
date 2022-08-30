<?php

namespace App\Controllers;

use \Core\View;

/**
 * Home controller
 *
 */
class Home extends \Core\Controller
{

    /**
     * Before filter
     *
     * @return void
     */
    protected function before()
    {

    }

    /**
     * After filter
     *
     * @return void
     */
    protected function after()
    {

    }

    /**
     * Show the index page
     *
     * @return void
     */
    public function indexAction()
    {
//        echo 'Hello from the index action in the Home controller!';

        View::renderTemplate('Home/index.html ', [
            'name' => 'Dave',
            'colours' => ['red', 'green']
        ]);
    }
}
