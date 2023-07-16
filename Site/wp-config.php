<?php
/**
* The base configuration for WordPress
*
* The wp-config.php creation script uses this file during the installation.
* You don't have to use the web site, you can copy this file to "wp-config.php"
* and fill in the values.
*
* This file contains the following configurations:
*
* * Database settings
* * Secret keys
* * Database table prefix
* * ABSPATH
*
* @link https://wordpress.org/support/article/editing-wp-config-php/
*
* @package WordPress
*/

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'ezyro_33321395_wp13' );

/** Database username */
define( 'DB_USER', '33321395_3' );

/** Database password */
define( 'DB_PASSWORD', 'w-n)S4x34p' );

/** Database hostname */
define( 'DB_HOST', 'sql302.byetcluster.com' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
* Authentication unique keys and salts.
*
* Change these to different unique phrases! You can generate these using
* the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
*
* You can change these at any point in time to invalidate all existing cookies.
* This will force all users to have to log in again.
*
* @since 2.6.0
*/
define( 'AUTH_KEY',         'qklqvsn9tyu3lug1qn3yobf803etxlojglx7nzlshdqt1vuyh6uxx9winew8wb1z' );
define( 'SECURE_AUTH_KEY',  't19ppdyqbg1x0mye8dqaz1yqffwwtlojrldgrlswctvwttagfd3ljmgjcodfeysa' );
define( 'LOGGED_IN_KEY',    'pciu7jzdr3ar1q24sakiyfx8o2eezopfccd392nhckn5msifl4fermly9vhvmsuc' );
define( 'NONCE_KEY',        'dm8tadwgk9afndpoltlkutjtvcyaibndmzgnqlg7sjfltruafwzbwzoqoatgravv' );
define( 'AUTH_SALT',        'deruuox9g2qm7gbfwkxjobord48y8tfppdkmx8hr9dueg3b7kp2zysc5anmkodk3' );
define( 'SECURE_AUTH_SALT', 'gbv3giiox4uucqvnxyr5neod3spwxih7czlene6wgjn4j2tr6ffaxigx2q8rgvuv' );
define( 'LOGGED_IN_SALT',   'rjtbyp4uypbyb8drijcp28jirdnt3lnsrsuastaou4rzbemk3z1fg1w8asgwte1k' );
define( 'NONCE_SALT',       'leestc0eocnuojynwhxxjlfc0cwkv6qznz5ir5kxk0cavifnikiyhl3mba4h47wk' );

/**#@-*/

/**
* WordPress database table prefix.
*
* You can have multiple installations in one database if you give each
* a unique prefix. Only numbers, letters, and underscores please!
*/
define( 'DISALLOW_FILE_EDIT', true ); // Added by Defender
$table_prefix = 'wpen_';

/**
* For developers: WordPress debugging mode.
*
* Change this to true to enable the display of notices during development.
* It is strongly recommended that plugin and theme developers use WP_DEBUG
* in their development environments.
*
* For information on other constants that can be used for debugging,
* visit the documentation.
*
* @link https://wordpress.org/support/article/debugging-in-wordpress/
*/
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



define( 'WP_CACHE', true ); // Added by Hummingbird
/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
