'use strict';

var React = require('react');

/**
 * 菜单组件
 */
var Menu = React.createClass({
    render: function () {
        return <div className="ui green inverted menu">
            <a className="active item">
                <i className="home icon"></i> Simple Code Generator
            </a>
        </div>
    }
});

module.exports = Menu;