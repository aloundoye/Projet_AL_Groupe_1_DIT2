<?php

namespace App\Controllers;

use \Core\View;
use App\Models\Post;


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
        $posts = Post::getAll();

        View::renderTemplate('Home/index.html ', [
            'posts' => $posts
        ]);
    }
}
